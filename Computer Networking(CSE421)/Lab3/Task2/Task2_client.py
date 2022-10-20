import socket

PORT=5050
HEADER=64
FORMAT='utf-8'
terminate_request="stop"

client_ip=socket.gethostbyname(socket.gethostname())
ADDR=(client_ip,PORT)

client=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
client.connect(ADDR)

def send(msg) :
    message=msg.encode(FORMAT)
    msg_length=len(msg)
    send_length=str(msg_length).encode(FORMAT)
    send_length += b" "*(HEADER-len(send_length))

    client.send(send_length)
    client.send(message)

    print(client.recv(2048).decode(FORMAT))

while 1:
    print("Write a sentence. Write stop if you want to disconect:")
    msg=input()
    if msg==terminate_request:
        send(msg)
        break
    else:
        send(msg)




