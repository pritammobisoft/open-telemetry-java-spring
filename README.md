# open-telemetry-java-spring
Integrating OpenTelemetry in your Java Spring Application
 1. start product and inventory service (make sure they run on different port)
 2. run the below docker command to start the jaeger locally
 ```
docker run -d --name jaeger -p 16686:16686 -p 4318:4318 jaegertracing/all-in-one:latest
 ```  
