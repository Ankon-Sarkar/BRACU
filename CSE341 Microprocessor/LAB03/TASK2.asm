.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE 
        
        ;TAKE INPUT AND INPUT+20
        MOV AH,1
        INT 21H
        MOV BL,AL
        ADD BL,20H
        
        ;MOVE TO NEXT LINE
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        
        ;PRINT OUTPUT
        MOV AH,2
        MOV DL,BL
        INT 21H
         
        
        ; YOUR CODE ENDS HERE
        
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
