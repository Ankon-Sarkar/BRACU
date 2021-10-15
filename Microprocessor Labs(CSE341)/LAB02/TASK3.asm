.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE  
    X DW 2
    Y DW 6
    Z DW 3

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE
         MOV AX,X
         MOV BX,Y
         MOV CX,Z
         
         MUL BX
         DIV CX
        
        ; YOUR CODE ENDS HERE
        
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
