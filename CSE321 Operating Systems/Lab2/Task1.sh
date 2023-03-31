#!/bin/bash
sum=0
for ((i=1;i<=10;i++))
do
read num
if (( $num % 2 == 0 )) && (($num % 8 != 0 ))
then sum=$(($sum+$num))
fi

done
echo "sum: $sum"