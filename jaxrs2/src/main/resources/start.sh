#!/bin/sh
/usr/local/glassfiss4/glassfish/bin/asadmin start-domain
/usr/local/glassfiss4/glassfish/bin/asadmin -u admin deploy /bookstore.war
/usr/local/glassfiss4/glassfish/bin/asadmin stop-domain
/usr/local/glassfiss4/glassfish/bin/asadmin start-domain --verbose