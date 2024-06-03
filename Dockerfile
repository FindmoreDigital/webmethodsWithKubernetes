FROM softwareag/webmethods-microservicesruntime:10.15

COPY ./application.properties /home
COPY ./packages /opt/softwareag/IntegrationServer/packages
COPY ./config /opt/softwareag/IntegrationServer/config
