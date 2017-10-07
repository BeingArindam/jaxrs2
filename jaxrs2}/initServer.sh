echo "AS_ADMIN_PASSWORD=AS_ADMIN_NEWPASSWORD=password" >> /home/serverPassword.txt
asadmin --user=admin --passwordfile=/home/serverPassword.txt change-admin-password --domain_name domain1
rm /home/gf-password.txt

asadmin start-domain

echo "AS_ADMIN_PASSWORD=AS_ADMIN_NEWPASSWORD=password" >> /home/serverPassword.txt
asadmin --user=admin --passwordfile=/home/serverPassword.txt enable-secure-admin
rm /home/gf-password.txt

asadmin --user=admin stop-domain

asadmin start-database

asadmin start-domain -v
