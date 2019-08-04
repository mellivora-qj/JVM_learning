package org.qj.test;

/*
 * ��ǰ�������(current classloader)
 * 
 * ÿ���඼��ʹ���Լ����������(������������������)��ȥ����������(ָ��������������)��
 * ���ClassX������ClassY����ôClassX����������ͻ�ȥ����ClassY(ǰ����ClassY��δ������)��
 * 
 * �߳��������������(Context ClassLoader)
 * 
 * �߳�������������Ǵ�JDK1.2��ʼ����ġ���Thread�е�getContextClassLoader()��setContextClassLoader(ClassLoader cl)
 * �ֱ�������ȡ���������������������
 * 
 * ���û��ͨ��setContextClassLoader(ClassLoader cl)�������õĻ����߳̽��̳��丸�̵߳����������������
 * JavaӦ������ʱ�ĳ�ʼ�̵߳����������������ϵͳ������������߳������еĴ������ͨ�����������������������Դ��
 * 
 * �߳������������������Ҫ�ԣ�
 * 
 * SPI(Service Provider Interface)
 * 
 * ��ClassLoader����ʹ�õ�ǰ�߳�Thread.currentThread().getContextClassLoader()��ָ����classloader�����ص��ࡣ
 * ��͸ı��˸�ClassLoader����ʹ����ClassLoader��������û��ֱ�ӹ�ϵ��ClassLoader���ص������������ı���˫��ί��ģ�͡�
 * 
 * �߳�����������������ǵ�ǰ�̵߳�Current ClassLoader��
 * 
 * ��˫��ί��ģ���£���������������ϵģ����²�����������ί���ϲ���м��ء����Ƕ���SPI��˵����Щ�ӿ���JAVA���Ŀ����ṩ�ġ�
 * ��Java���Ŀ�������������������صģ�����Щ�ӿڵ�ʵ��ȴ���Բ�ͬ��jar��(�����ṩ)��Java��������������ǲ������������Դ��
 * jar����������ͳ��˫��ί��ģ�;��޷�����SPI��Ҫ�󡣶�ͨ����ǰ�߳���������������������Ϳ��������õ����������������ʵ��
 * ���ڽӿ�ʵ����ļ��ء�
 * 
 */
public class MyTest24 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getContextClassLoader());
		System.out.println(Thread.class.getClassLoader());
	}
}
