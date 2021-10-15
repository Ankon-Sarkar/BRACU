.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE  
        
        ;TAKE 1ST INPUT 
        MOV AH,1
        INT 21H
        MOV BL,AL 
        MOV AX,1
        MUL BL
        MOV CX,AX
        
        
       ;MOVE TO NEXT LINE
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
       
        ;TAKE 2ND INPUT 
        MOV AH,1
        INT 21H 
        MOV BL,AL
        
        
        ;MULTIPLY
        MOV AX,CX
        MUL BL
        MOV CX,AX
        
        ;MOVE TO NEXT LINE
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        
        ;PRINT
        MOV DX,CX
        MOV AH,2 
        INT 21H
         
         
        ; YOUR CODE ENDS HERE
        
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
