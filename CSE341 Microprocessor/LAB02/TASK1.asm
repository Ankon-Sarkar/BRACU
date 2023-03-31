                    .MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE 
    
   TEMP DW 0

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE 
        MOV AX,5
        MOV BX,2 
        
        ;SWAP FROM BX TO AX
        MOV CX,AX
        NEG CX
        ADD AX,BX
        MOV DX,AX 
        ADD AX,CX
       
        ;SWAP FROM AX TO BX 
        NEG BX
        ADD DX,BX
        MOV BX,DX 
        
        
       
        ; YOUR CODE ENDS HERE
        
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
