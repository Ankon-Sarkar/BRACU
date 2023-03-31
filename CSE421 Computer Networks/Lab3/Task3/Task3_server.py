import socket
import threading

server_ip=socket.gethostbyname(socket.gethostname())
port=5050
address=(server_ip,port)
terminate_msg="Connection Terminated"
FORMAT='utf-8'

server=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
server.bind(address)

def handle_client(conn,client_address):
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
                vowels=["A","E","I","O","U","a","e","i","o","u"]
                count=0

                for i in msg:
                    if i in vowels:
                        count+=1
                if count==0:
                    send_msg="Not enough vowels"

                elif count<=2:
                    send_msg="Enough vowels I guess"
                else:
                    send_msg="Too many vowels"

                conn.send(send_msg.encode("utf-8"))

    print("*********************")
    conn.close()

def start():
    print("Server is starting.....")
    server.listen()

    while 1:
        conn, client_address = server.accept()
        print("connected to", client_address)

        thread= threading.Thread(target=handle_client,args=(conn,client_address))
        thread.start()

start()