echo " switchcase demo starts..."
case $1 in
start)
echo " Starting SonalQube Sever.. "
echo " Started ... "
;;
stop)
echo " Stoping SonalQube Sever.. "
echo " Stoped ... "
;;
restart)
echo " reStarting SonalQube Sever.. "
echo " reStarted ... "
;;
*)echo " Please pass the correct Arguments..."
echo " Usage: sh $0 Start/Stop/restart/status "
;;
esac
echo " switchcase demo over .... "
