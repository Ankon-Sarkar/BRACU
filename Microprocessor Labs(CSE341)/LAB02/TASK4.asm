.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE
       MOV AX,1
       MOV BX,2
       ADD AX,BX
       
       MOV CX,3
       MOV DX,1
       SUB CX,DX 
       
       MUL CX
       MOV BL,5
       DIV BL 
       
       MOV BL,3
       MOV BH,2
       ADD AL,BL
       ADD AL,BH
       MOV CL,AL
       
       MOV AX,1
       MOV BX,2
       MUL BX
       
       SUB CX,AX
       
       
       
       
       
         
        
        ; YOUR CODE ENDS HERE
        
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
