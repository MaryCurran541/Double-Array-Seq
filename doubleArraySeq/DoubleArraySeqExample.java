package doubleArraySeq;


/*
 * Mary Curran Computer Science 3 Assignment 5 
 * 
 * program to use DoubleArraySeq create strings and add to, delete and combine arrays.  
 * 
 * @author Mary Curran 
 * @version 1.0
 * @since 9/14/21
 */



public class DoubleArraySeqExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleArraySeq sequenceA = new DoubleArraySeq(22);
		DoubleArraySeq sequenceB = new DoubleArraySeq();
		DoubleArraySeq sequenceC = new DoubleArraySeq();

		// Testing addAfter, addBefore, and start() on sequenceA.  
		sequenceA.addAfter(34.1);
		System.out.println(sequenceA);
		
		sequenceA.addAfter(2.6);
		System.out.println(sequenceA.toString());
		
		sequenceA.addAfter(13.5);
		
		sequenceA.start();	// at this point it should be {34.1, 2.6, 13.5}
		System.out.println(sequenceA.toString());
		
		
		System.out.println(sequenceA.toString());
		sequenceA.addAfter(7.9);
		System.out.println(sequenceA.toString());
		sequenceA.addAfter(1.0);
		System.out.println(sequenceA.toString());
		sequenceA.addBefore(66.6);
		System.out.println(sequenceA.toString());
		
		sequenceA.start();	// at this point it should be {34.1, 2.6, 13.5}
		System.out.println(sequenceA.toString());
	
		sequenceA.addBefore(36.0);
		System.out.println(sequenceA);
		
		sequenceA.addBefore(99.9);
		System.out.println(sequenceA);
		
		sequenceA.addBefore(7.5);
		System.out.println(sequenceA);
		
		sequenceA.addBefore(8.4);
		System.out.println(sequenceA);
		
		sequenceA.addBefore(15.5);
		System.out.println(sequenceA);
		
		
		System.out.println(sequenceA.toString()); // should be {15.5, 8.4, 7.5, 99.9, 36.0, 34.1, 7.9, 66.6, 1.0, 2.6, 13.5}
		System.out.println("Capacity: " +  sequenceA.getCapacity()); // should be 22
		

		
		
		// create two sequences to combine into one.
		sequenceB.addAfter(0.5);
		sequenceB.addAfter(0.8);
		sequenceB.addAfter(1.5);
		sequenceB.addAfter(1.8);
		sequenceB.addAfter(2.5);
		sequenceB.addAfter(2.8);
		System.out.println("Sequence B: " +  sequenceB.toString());
		
		sequenceC.addAfter(0.1);
		sequenceC.addAfter(0.2);
		sequenceC.addAfter(0.3);
		sequenceC.addAfter(0.4);
		sequenceC.addAfter(0.5);
		sequenceC.addAfter(0.6);
		System.out.println("Sequence C: " + sequenceC.toString());
		
		//adds sequenceC to the end of sequenceB
		sequenceB.addAll(sequenceC); // should be {0.5, 0.8, 1.5, 1.8, 2.5, 2.8, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6}
		System.out.println(sequenceB.toString());
		System.out.println("Capacity: " +  sequenceB.getCapacity());
		
		
		DoubleArraySeq combinedSeq = DoubleArraySeq.catenation(sequenceA, sequenceC);
		System.out.println("Combined A & C: " + combinedSeq.toString()); // combines sequenceA with sequenceC above
		
//		sequenceA.getCurrent( );
//		System.out.println(sequenceA.getCurrent());
		
		sequenceA.advance();
		sequenceA.advance();
		sequenceA.advance();
		sequenceA.advance();
		sequenceA.advance();
				
//		sequenceA.getCurrent( );
//		System.out.println(sequenceA.getCurrent());
		
		sequenceA.removeCurrent( ); // sequenceA's currentIndex should be 5 at this point.  data[5] = 34.1
		System.out.println(sequenceA.toString()); // should be {15.5, 8.4, 7.5, 99.9, 36.0, 7.9, 66.6, 1.0, 2.6, 13.5}
		
		sequenceC.removeCurrent(); // sequenceC's currentIndex should be 5, which is the last element (0.6).
		System.out.println(sequenceC.toString()); // should be {0.1, 0.2, 0.3, 0.4, 0.5}
		
		sequenceB.addAfter(3.3);
		System.out.println(sequenceB.size());
		System.out.println(sequenceB.toString());
		System.out.println(sequenceB.getCapacity());
		sequenceB.trimToSize();
		System.out.println(sequenceB.getCapacity());
		System.out.println(sequenceB.toString());
		
		
	}
	

}
		
		
		
	
		
		
		
		
		
		
		

	


