import socket

server_ip=socket.gethostbyname(socket.gethostname())
port=5050
address=(server_ip,port)
terminate_msg="Connection Terminated"
FORMAT='utf-8'

server=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
server.bind(address)
print("Server is starting.....")
server.listen()

while 1:
    conn,client_address=server.accept()
    print("connected to",client_address)
    connectd=True
    while connectd:
        msg_length=conn.recv(64).decode(FORMAT)
        if msg_length:
            msg_length=int(msg_length)
            msg=conn.recv(msg_length).decode(FORMAT)

            if msg=="stop":
                connectd=False
                print("Closing Connection with",client_address)
                conn.send(terminate_msg.encode(FORMAT))

            else:
                print("Msg recieved")
                conn.send(msg.encode("utf-8"))

    print("*********************")
    conn.close()


