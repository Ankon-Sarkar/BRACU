.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE  
    
       A DB "ENTER A HEX DIGIT: $"  
       B DB "IN DECIMAL IT IS $" 

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE 
        
        ;TAKE INPUT
        LEA DX,A
        MOV AH,9
        INT 21H 
        MOV AH,1
        INT 21H
        MOV BH,AL
        
        ;MOVE TO NEXT LINE
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        LEA DX,B
        MOV AH,9
        INT 21H
        
        ;PRINT 1
        MOV BL,31H
        MOV AH,2
        MOV DL,BL
        INT 21H
        
        ;INPUT-11H CALCULATION
        SUB BH,11H
        MOV DL,BH
        MOV AH,2
        INT 21H
        
         
        
        ; YOUR CODE ENDS HERE
        
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
