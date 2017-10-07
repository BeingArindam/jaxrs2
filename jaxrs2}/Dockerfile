FROM glassfish

ADD ../../../target/bookstore.war /usr/local/glassfish4/domains/domain/autodeply

ADD initServer.sh /home/
RUN chmod +x /home/initServer.sh
CMD /home/initServer.sh

EXPOSE 8080 4848