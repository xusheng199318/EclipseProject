package test;
/*
 * ����ģʽ��
 * 		���� ����ģʽ��
 * 		1.��̬��Ա����
 * 		2.˽�л����� ����
 * 		3.��̬��ȡ���� ����
 * */
public class Single {

	private static Single s;
	
	private Single(){}
	
	public static Single getInstance(){
		if(s == null){
			synchronized ("��") {
				if(s == null){
					s = new Single();
				}
			}
		}
		return s;
	}
}
