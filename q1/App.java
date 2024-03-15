public class App {
    /* คิดว่าคลาส ImageManager ขัดต่อ SOLID Principle เพราะทำหลายหน้าที่ และใช้ Strategy ในการแก้ไข */
    public static void main(String[] args) {
        ImageManager manager = new ImageManager();
		manager.setRenderer(new SmartphoneRenderer());
		manager.show();
    }
}

