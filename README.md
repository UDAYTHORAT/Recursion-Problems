  What is happening in this Question -->

  initially -->

  |      |     |
  | 1    |     |
  | 2    |     |
  | 3    |     |
  S      H     D


  The first call is made to the (3,S,H,D) S->source,H->helper,D->destination;

  This is called then it enters the method then -->
  it checks if n==1 if no the move down-->
  now it comes to the #1
  where it calls the -->(2,S,D,H) a recursive call then it again goes above and re-enters the method-->
  then it checks if n==1 or not if not move down -->
  then (1,S,D,H) is called but here -->
  new S=old S (S)
  new H=old D(H)
  new D=old H(D)
  so the call is (1,S,H,D) n==1 the base case-->

  |      |     |
  |      |     |
  | 2    |     |
  | 3    |     |1
  S      H     D

  now return then  it goes back to the call (2,S,D,H)-->#1
  then goes to the #2 and print ""move disk 2 form  S to D (that  is S=S and D=H)""  2 goes form S=>H #2


  |      |     |
  |      |     |
  |      |     |
  | 3    |2    |1
  S      H     D

  so now we go to the #3
  this is when n==2 (n-1,H,S,D)
  it calls (1,H,S,D) where -->
   new S= old H (D)
   new H=old S (S)
   new D=old D(H)

   to understand this look at this  call --> (2,S,D,H);

   //Base case is hit then print S->D which is (1,D,S,H) 1 goes form (D-->H)

  |      |     |
  |      |     |
  |      |1    |
  | 3    |2    |
  S      H     D

  then return as the base case is hit now move further--> form #3
  we return to the (2 ,S,D,H) this also returns to the (3,S,H,D) -->which is the #1
  then print the #2 that is move 3 form S -> D


  |      |     |
  |      |     |
  |      |1    |
  |      |2    |3
  S      H     D


  then we go to the (n-1,H,S,D) #3 call -->
  which calls the (2,H,S,D) this again makes the recursive call to the up and checks if the n==1 if not move down
  then it comes to the call (n-1,S,D,H)-->
  where it calls the (1,S,D,H)-->where
  new S=old S (H)
  new H=old D(D)
  new D=old H(S)

  (to understand look at the previous call that is (2,H,S,D) and this was made by the (3,S,H,D) )

  calls(1,H,D,S)
  base case is it then it prints the move disk 1 from Helper to the Source  because the S=H and D=S

  |      |     |
  |      |     |
  |      |     |
  |1     |2    |3
  S      H     D

  now we return to where the call was made that is(2,H,S,D) then it prints the #2
  that says move 2 from Source to the destination that is form Helper to the Destination

  |      |     |
  |      |     |
  |      |     |2
  |1     |     |3
  S      H     D

  this then calls the (n-1,H,S,D) that is #3
  where the (1,H,S,D)->
  new S=old H (S)
  new H= old S(H)
  new D=old D(D)

  this call is (1,S,H,D)-->
  base case is hit that calls the move 1 form source to the destination that is Move 1 from S to destination

  |      |     |
  |      |     |1
  |      |     |2
  |      |     |3
  S      H     D

  then we return to the final call and the program is over .
      
