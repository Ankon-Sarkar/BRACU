.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE 
    A DW 10
    B DW 5
    C DW 3

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE 
        MOV AX,A
        MOV BX,B
        MOV CX,C
        
        SUB AX,CX
        ADD BX,AX
        MOV AX,BX
        
                
                
        
        ; YOUR CODE ENDS HERE
        
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
