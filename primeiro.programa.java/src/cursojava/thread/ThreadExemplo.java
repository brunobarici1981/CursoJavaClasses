package cursojava.thread;

import java.io.Closeable;

import javax.swing.JOptionPane;

/**
 * 
 */
public class ThreadExemplo {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
  
		
		thread1.run();
		new Thread() {

			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("executadando rotina de envio de email");
				}
				int i = JOptionPane.showConfirmDialog(null,
						"O sistema terminou o processamento deseja terminar o processamento?");
				if (i == 0) {
					System.exit(0);
				}
			}
		}.start();

		// Processamento em paralelo usando threads
		Thread threadMail = new Thread()
		 {
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("executadando rotina de notas fiscais " );
				}
				int i = JOptionPane.showConfirmDialog(null,
						"O sistema terminou o processamento deseja terminar o processamento?");
				if (i == 0) {
					System.exit(0);
				}
			}
		};
		JOptionPane.showMessageDialog(null,threadMail.getState());
		threadMail.start();

		JOptionPane.showMessageDialog(null, "O sistema continua rodando em background");
	}
	public static Runnable thread1 = new Runnable() {
        
		Thread thread = new Thread(thread1);
		@Override
		public void run() {for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("executadando rotina de notas fiscais portal "+thread1.toString());
			
		}
		int i = JOptionPane.showConfirmDialog(null,
				"O sistema terminou o processamento deseja terminar o processamento?");
		if (i == 0) {
			System.exit(0);
		}
				
		}
		
	};
}
