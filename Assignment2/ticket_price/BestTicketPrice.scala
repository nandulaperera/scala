object BestTicketPrice{

  def attendees(ticketPrice:Int):Int = 120 + (15 - ticketPrice)/ 5 * 20;

  def revenue(ticketPrice:Int):Int = attendees(ticketPrice) * ticketPrice;

  def totalCost(ticketPrice:Int):Int = 500 + 3 * attendees(ticketPrice);

  def profit(ticketPrice:Int):Int = revenue(ticketPrice) - totalCost(ticketPrice);

  var ticketPrice:Int = 5;

  var bestProfit = profit(ticketPrice);

  def main(args:Array[String]){
    while(true){
      if(profit(ticketPrice+5) >= bestProfit){
        ticketPrice += 5;
        bestProfit = profit(ticketPrice); 
      }else{
        printf("The best ticket price is Rs.%d\n",ticketPrice);
        return;
      }
    }
  }
} 


