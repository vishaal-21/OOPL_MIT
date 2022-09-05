echo Enter the coefficient of x^2:
read a
echo Enter the coefficient of x:
read b
echo Enter the constant term:
read c
f=`echo "-($b)" | bc`
p=`expr 2 \* $a`
d=`echo \( \( $b \* $b \) - \( 4 \* $a \* $c \) \) | bc`

if [ $d -lt 0 ]
then
x=1
elif [ $d -eq 0 ]
then
x=0
else
x=2
fi


case $x in
0)
	res=`expr $f / $p`
    echo The root is: $res
    ;;


1)
    x=`echo "-($d)" | bc`
    s=`echo "scale=2; sqrt ( $x )" | bc`
    echo The first root is:
    echo "($f + $s i) / $p"
    echo The second root is:
    echo "($f - $s i) / $p"
    ;;     

2)
    s=`echo "scale=2; sqrt( $d )" | bc`
    res1=`echo "scale=2; ( $f + $s) / ( $p )"|bc`
    res2=`echo "scale=2; ( $f - $s) / ( $p )"|bc`
    echo The first root is: $res1
    echo The second root is: $res2
    ;;
esac


