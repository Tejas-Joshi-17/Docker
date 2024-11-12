1) Tejas Joshi

``` plantuml
interface "LB" as LB


folder "UPI Suite Plus" as A {
component "USP - Account Service" as ACC_USP
component "BIG (Account Discovery) " as BIG
component "BIG (Prime) " as BIG_PRIME

component "Notification Service " as BIG_NS
node "KAFKA" as N_Q {
 rectangle " " as K1
 rectangle " " as K2
 rectangle " " as K3
 
 K1 -right- K2 #FFF
 K2 -right- K3 #FFF

}

database "Account\n  Store" as AS_DB
database "Master\nMeta\nConfiguration Store" as MM_DB
frame "Service Tranlog" as ST 
component "Risk Engine" as SRE
database "SRE" as SRE_DB

SRE ~~> SRE_DB

}


component "CAR" as CAR
component "RIB" as RIB

ACC_USP -left-> AS_DB
ACC_USP ~down~> MM_DB

ACC_USP ~right-> ST


LB --> ACC_USP : .  Inward traffic

ACC_USP -down-> BIG
ACC_USP -down-> BIG_PRIME
ACC_USP ~~~> N_Q : Notification Queue
N_Q <~down-> BIG_NS
ACC_USP -down--> SRE


BIG --right-> RIB
BIG --> CAR
BIG_PRIME -left-> PRIME

```

1) Samarth Usture