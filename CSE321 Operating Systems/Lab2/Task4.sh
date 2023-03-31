#!/bin/bash

function addition()
{
    sum=$(($1 + $2))
    echo "sum: $sum"
}

function subtraction()
{
  sub=$(($1 - $2))
    echo "subtraction: $sub"
}

function multiplication(){
  mul=$(($1 * $2))
  echo "product: $mul"
}


echo "Enter 1st number:"
read num1
echo "Enter 2nd number:"
read num2
echo "Enter 3rd number:"
read num3


if [ $num1 -gt $num2 ] ;
then
 subtraction $num1 $num2

 elif [ $num3 -lt $num2 ];
 then addition $num3 $num2

 elif [ $num2 == $num3 ];
 then multiplication $num2 $num3


fi


