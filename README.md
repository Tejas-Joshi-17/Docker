1) Tejas Joshi

``` plantum
@startuml
autonumber

Alice -> Bob: Authentication Request
Bob --> Alice: Authentication Response

Alice -> Bob: Another authentication Request
Alice <-- Bob: another authentication Response

autonumber
Bob -> Alice : Authentication Request
Bob <- Alice : Authentication Response
@enduml
```

1) Samarth Usture