if [ $# -eq 2 ]
then
echo "CMD line args demo ..."
echo " script name: "$0
echo "1st arg is : "$1
echo "2nd arg is : "$2
echo "3rd arg is : "$3
echo "11nd arg is : "${11}
echo "number of arg : " $#
echo " PID is : "$$
echo " All the arg is : "$*
echo " All the arg is : " $@
date
echo " Previoues cmd execution status: "$?
else
echo " Please pass the 2 args"
echo " Usage : sh $0 dbname /var/backup/ "
