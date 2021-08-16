# Demo-api
you can make api-calls like shown below

go to https://github.com/rafiu007/Demo-api/blob/main/src/main/java/io/rafiu/springbootapi/api/Api.java and run it as a java application.

I have created one bonus api to see all data in a databas at a given time.
```
curl --location --request POST '0.0.0.0:8080/addShape/' \
--header 'Content-Type: application/json' \
--data-raw '[
    {"id":"1",
    "type":"square",
    "length":1,
    "breadth":2},
    {"id":"2",
    "type":"square",
    "length":1,
    "breadth":2}
]'
```
```
curl --location --request GET '0.0.0.0:8080/results/1'
Additional api.
```
```
curl --location --request GET '0.0.0.0:8080/shapes'
```
I have 1YOE and tried to do this with spring.
