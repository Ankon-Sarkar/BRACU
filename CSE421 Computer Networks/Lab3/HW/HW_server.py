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
                hours=int(msg)
                if hours <= 40:
                    salary = hours * 200
                else:
                    salary = 8000 + (hours - 40) * 300

                conn.send(str(salary).encode(FORMAT))

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
