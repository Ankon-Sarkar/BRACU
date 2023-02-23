import string

# predifined table
keywords=['break','case','char','const','continue','default','do','double','else','float','for','if', 'int','long',
'return','static','switch','void','while']

indentifier= list(string.ascii_lowercase)+list(string.ascii_uppercase)

math_operator=['+', '-', '*' , '/', '%', '++', '--','=']

logical_operator=['<','>','&&','||','!']

other_elem=['(', ')' ,'{' ,'}',',',';']



# set for storing symbol table
analyzed_keyword=set()
analyzed_identifier=set()
analyzed_mathoperator=set()
analyzed_logicaloperator=set()
analyzed_others=set()
analyzed_num=set()


# lexical analyzer function
def lexical_analyzer(word):
    if word in keywords:
        analyzed_keyword.add(word)

    elif word in indentifier:
        analyzed_identifier.add(word)

    elif word in math_operator:
        analyzed_mathoperator.add(word)

    elif word in logical_operator:
        analyzed_logicaloperator.add(word)

    elif word in other_elem :
        analyzed_others.add(word)

    else:
        analyzed_num.add(word)

# print output
def printAll():
    print("keywords:", end=" ")
    print(*analyzed_keyword, sep=", ")

    print("Identifiers:", end=" ")
    print(*analyzed_identifier, sep=", ")

    print("Math Operators:", end=" ")
    print(*analyzed_mathoperator, sep=", ")

    print("Logical Operators:", end=" ")
    print(*analyzed_logicaloperator, sep=", ")

    print("Numerical Values:", end=" ")
    print(*analyzed_num, sep=", ")

    print("Other:", end=" ")
    print(*analyzed_others, sep=" ")


# driver code
file = open("input.txt")
for current_line in file:
    spilitted=current_line.split()
    for word in spilitted:
        lexical_analyzer(word)

printAll()
file.close()



