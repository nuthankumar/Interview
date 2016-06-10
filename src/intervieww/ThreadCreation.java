/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intervieww;

/**
 *
 * @author Davidvilla
 */
class nuthan{
	nuthan(){
		
	}
}
public class ThreadCreation extends Thread {
	nuthan obj;
	ThreadCreation(nuthan obj){
		this.obj=obj;
	}
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
    	nuthan obj=new nuthan();
        ThreadCreation t1 = new ThreadCreation(obj);
        t1.start();
        

    }
}

