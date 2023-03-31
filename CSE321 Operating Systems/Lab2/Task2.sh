#!/bin/bash
echo "Enter a number:"
read num
if (( $num % 4 != 0 )) && (($num % 5 != 0 )) && (($num%10==0))
then echo "Rasengan"

elif (($num % 5 == 0)) && (($num % 6 != 0 ))
then echo "Oodama Rasengan"

elif (($num % 5 != 0)) && (($num % 6 == 0 ))
then echo "Oodama Rasengan"

elif (($num % 5 == 0)) && (($num % 6 == 0 ))
then echo "Rasen Shuriken"

fi

