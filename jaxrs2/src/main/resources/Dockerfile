FROM glassfish

COPY bookstore.war /
COPY start.sh /

EXPOSE 8080 4848
RUN chmod +x /start.sh
CMD /start.sh