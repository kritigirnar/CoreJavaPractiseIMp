83. Class ThreadExample
84. {
85. Public void synchronized printTable(int n) //synchronized( this){ // sync block
86. {
87. for ( int i=1;I<5;I++)
88. {
89. Syso(i*n);
90. }
91. try{
92. Thread.sleep(400);
93. }
94. Catch(Exception e) 
95. {
96. Syso(e.printStackTrace());
97. }}
98. Class Thread1 extends Thread 
99. { 
100. Public void run()
101. {
102. printTable(20);
103. }
104. Class Thread2 extends Thread
105. {
106. printTable(100);
107. }
108. Class testSynchronixzation
109. {   
110. ThreadExa thex1=new ThreadExa();
111. Thread1 t1=new Thread1(thex1);
112. Thread2 t2= new Thread2(thex1); 
113. t1.start();
114. t2.start();
115. }
116. }
