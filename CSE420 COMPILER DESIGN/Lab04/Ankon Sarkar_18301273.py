stack=[]
method_extraction = []
returntype_extraction=[]
accsess_modifier=('public','private','protected')
not_allowed=('main','while','for')
output=[]

#find method name and return type
def method_finder(line):
    if line.startswith(accsess_modifier):
        chararray = list(line)
        count = 0
        for i in chararray: #push in stack until getting "("
            if i != '(':
                stack.append(i)
                count += 1

            else:
                while (stack[-1] != " "):
                    x = stack.pop()
                    method_extraction.insert(0, x) #prepend

                method_name = "".join(method_extraction)
                #avoid special keyword and contructor
                if (method_name not in not_allowed and not method_name[0].isupper()):
                    parameter=line[count:len(line)-1] #find parameter of method
                    stack.pop()

                    #find return type
                    while (stack[-1] != " "):
                        x = stack.pop()
                        returntype_extraction.insert(0, x) #prepend

                    return_type="".join(returntype_extraction)
                    output.append(method_name+''+parameter+'return type:'+return_type)


                method_extraction.clear()
                returntype_extraction.clear()
                stack.clear()


#driver
file = open("input.txt")
for current_line in file:
        method_finder(current_line)

#print output
print("Methods: ")
for i in output:
    print(i)