#!/bin/bash

echo " Enter a number: "
read num




list=()

ishappy(){
rem=$num
while [ $rem != 1 ] 
do
sum=0
# r=0
while [ $rem != 0 ]
do
r=$(( $rem % 10 ))
sum=$(( $sum +$(( $r * $r )) ))
rem=$(( $rem / 10 ))
done


for i in ${list[@]};
do
if [ $i == $sum ];
then
return 0
fi
done


list+=($sum)
rem=$sum
done
return 1
}



ishappy
result=$?
if [ $result == 1 ];then
echo "Happy number"
else
echo "Unhappy number"
fi
