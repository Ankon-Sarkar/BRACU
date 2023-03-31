#!/bin/bash

array=()

bubble_sort(){
for ((i = 0; i<num; i++));
do
for((j = 0; j<num-i-1; j++));
do
if [ ${array[j]} -gt ${array[$((j+1))]} ]
then  
temp=${array[j]}
array[$j]=${array[$((j+1))]}  
array[$((j+1))]=$temp
fi
done
done
}

echo "Enter the number of input you want to insert"
read num

for ((i=0;i<$num;i++));
do
read input 

array+=("$input")
done
bubble_sort

 echo "Output in ascending order: ${array[@]}"
