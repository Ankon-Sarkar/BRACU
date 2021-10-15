.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE
        
        ;1ST INPUT
        MOV AH,1
        INT 21H
        SUB AL,30H
        MOV BH,AL
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        
        ;2ND INPUT
        MOV AH,1
        INT 21H
        SUB AL,30H
        MOV CL,AL 
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        
        MOV AX,1
        MUL CL
        MOV CX,AX
        MOV DL,0
        
        REPEAT:   ;LOOP FOR REPEATED SUM
        ADD DL,BH
        LOOP REPEAT 
        
        MOV AH,2  ;PRINT ANSWER
        ADD DL,30H
        INT 21H
         
        
        ; YOUR CODE ENDS HERE
        
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
