
# LAB-10 Submission



## Slack Screenshot from Grader

![Slack](https://github.com/nguyensjsu/cmpe202-dharmadheeraj/blob/master/starbucks/images/Slack.PNG)

## Design Approach

*I've used Observer pattern with AddCard being the subject for notifying its observers like AppController,Balance,MyCards about the successful addition of the Card.

*AddCardDetails maintains the details of the card(cardnumber,cvv) and is responsible for validating the card and informing the AddCard class about the successful entry of card details.

*AddCars overrides the functionality of the next and previous opertaions from its parent component(Screen) and uses it to display the respective screens.

*The AppController is a fram change observer which is notified when ever there is change in the frame content which happens on touch or next or previous.


## UML Class Diagram for AddCard

![Combination 1](https://github.com/nguyensjsu/cmpe202-dharmadheeraj/blob/master/starbucks/images/ClassDiagram_AddCard.PNG)

![Combination 1](https://github.com/nguyensjsu/cmpe202-dharmadheeraj/blob/master/starbucks/images/ClassDiagram_AddCard.PNG)

![Combination 1](https://github.com/nguyensjsu/cmpe202-dharmadheeraj/blob/master/starbucks/images/ClassDiagram_AddCard.PNG)


