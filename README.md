# Demo-api
you can make api-calls like shown below
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