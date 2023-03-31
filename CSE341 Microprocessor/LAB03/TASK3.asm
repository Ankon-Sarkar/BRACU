.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE  
    A DB "Enter First Initial: $"  
    B DB "Enter Second Initial: $" 
    C DB "Enter Third Initial: $"

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE 
        
        
        ;INPUT 1ST
        LEA DX,A
        MOV AH,9
        INT 21h 
        MOV AH,1
        INT 21H
        MOV BL,AL
        
        
        ;INPUT 2ND
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        LEA DX,B
        MOV AH,9
        INT 21h 
        MOV AH,1
        INT 21H
        MOV BH,AL
         
        ;INPUT 3RD          
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H          
        LEA DX,B
        MOV AH,9
        INT 21h 
        MOV AH,1
        INT 21H
        MOV CL,AL
        
        ;PRINT 1ST
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        MOV AH,2
        MOV DL,BL
        INT 21H
        
        ;PRINT 2ND
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        MOV AH,2
        MOV DL,BH
        INT 21H 
        
        ;PRINT 3RD
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        MOV AH,2
        MOV DL,CL
        INT 21H
        
       
         
        
        ; YOUR CODE ENDS HERE
        
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
