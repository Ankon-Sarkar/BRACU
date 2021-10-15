.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE
    P1 DB "ENTER A HEX DIGIT: $"
    P2 DB "IN DECMAL IT IS $"
    P3 DB "DO YOU WANT TO DO IT AGAIN?: $"
    P4 DB "ILLEGAL CHARACTER INSERT IT AGAIN: $"

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE
        
        REPEAT:
        ;INPUT
        LEA DX,P1
        MOV AH,9
        INT 21h 
        MOV AH,1
        INT 21H
        MOV BL,AL
        
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H 
        
        CHECK1:  ; IF 0<=INPUT && INPUT<=9
        CMP BL,30H
        JL ISERT_AGAIN
        CMP BL,39H
        JG CHECK2
        
        LEA DX,P2
        MOV AH,9
        INT 21h
        MOV AH,2
        MOV DL,BL
        INT 21H
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H 
        
        ASK_AGAIN:
        LEA DX,P3
        MOV AH,9
        INT 21h 
        MOV AH,1
        INT 21H
        MOV BL,AL
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H 
        
        CMP BL,59H
        JE REPEAT
        CMP BL,79H
        JE REPEAT
        JMP EXIT 
        
        ISERT_AGAIN:
        LEA DX,P4
        MOV AH,9
        INT 21h 
        MOV AH,1
        INT 21H
        MOV BL,AL
        
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H 
        JMP CHECK1
        
        CHECK2:      ;IF A<=INPUT && INPUT<=F
        CMP BL,41H
        JL ISERT_AGAIN
        CMP BL,46H
        JG ISERT_AGAIN
       
        
        LEA DX,P2
        MOV AH,9
        INT 21h
        
        ;PRINT 1
        MOV DL,31H
        MOV AH,2
        INT 21H
        
        ;INPUT-11H CALCULATION
        SUB BL,11H
        MOV DL,BL
        MOV AH,2
        INT 21H
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H 
        
        JMP ASK_AGAIN
        ; YOUR CODE ENDS HERE
        EXIT:
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
