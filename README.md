Project Objective:
Create a console based Java application that would allow an electricity board clerk to compute the electricity bill amount that needs to be paid by the customer for a given type of electricity connection
Details:
There are two types of electric connections available. One is Domestic Connection and the other one is Commercial Connection. The following are the formulas that are to be used for computation of Bill for each type.
Domestic
Unit Slabs      Tariff Rate
First 50 units     2.3
Next 50 units      4.2
Remaining units    5.5
Commercial
Unit Slabs      Tariff Rate
First 50 units     5.2
Next 50 units      6.8
Remaining units    8.3

 
In Commercial Connection type, in addition to the bill amount there is an electricity duty that is applicable. The calculations for the electricity duty is as follows:
BillAmount             Electricity Duty
Bill Amount >= 10000        0.09
Bill Amount >=5000          0.06
Bill Amount < 5000          0.02

 
For example, if Bill Amount>10000 then
Electricity Duty=Bill Amount* 0.09
So the Final Amount Payable =Bill Amount + Electricity Duty
Eg) If units consumed is 120, then amount payable is 781.32 (i.e. 766 + 15.32)

