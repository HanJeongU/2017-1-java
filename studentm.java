package test1;

import java.util.*;

import java.lang.*;

public class studentm {

	static List listA = new ArrayList();// �̸�
	static List listB = new ArrayList();// �й�
	static List listC = new ArrayList();// ��ȭ��ȣ
	static List listemail = new ArrayList();
	static List listdepart = new ArrayList();// �Ҽ�(�к�)
	static List listSc = new ArrayList();// ���б�

	List listsub = new ArrayList();//������
	List listscore = new ArrayList();//������ ����
	List listCscore = new ArrayList();//��������

	static List listsubname = Arrays.asList("��ǻ�Ͱ���", "������ȣ����", "������ű��ʹ׽���", "���α�����ʹ׽���", "���ռ����Թ�", "�����ͱ���", "��ü�������α׷���",
			"������α׷���", "������ȣ��", "��ũ��Ʈ ���α׷���", "ȸ���̷й׽���", "���ڱ���", "�������", "VI�����׽ǽ�I", "����ȸ�μ��� �� ���� I", "3DCAD",
			"����ũ�����μ����׽���", "���������", "�˰���", "�ü��", "�ý������α׷���", "��ȣ �� ���� ��������", "������", "������", "�ڹ����α׷���", "����ũ����Ʈ�ѷ��׽���",
			"���İ���", "�����а���I", "VI���� �� �ǽ�II", "����ȸ�� ���� �� ���� II", "��ǻ�ͱ���", "��ǻ�ͳ�Ʈ��ũ", "��������α׷���", "���ͳ�����׽ǽ�",
			"��ǻ�ͱ������翬����������", "�ý��� ����", "�Ǽ��ڵ�м�", "���������Ȱ���", "��Ÿ�����", "�����н�ȣó���׼���", "����̷�", "����ȸ��", "���α������׽ǽ�I",
			"�������а���I", "���ڱ�������ͼ���׽ǽ�", "���м���I", "���α������ũ����Ʈ�ѷ�", "���α׷��־���", "����Ʈ�������", "��Ʈ��ũ���α׷���", "�Ӻ����ý��۹׽ǽ�",
			"��ǻ�ͽű��", "��ǻ�ͱ������׳��", "�繰���ͳݺ���", "���Ȱ�����", "��Ʈ��ũ ���ݰ� Ž�� ���� �ý���", "��ŷ �� ħ�ػ��м�", "�Ӻ����OS", "�����нý���",
			"���ͳ����", "���������", "����ȸ��", "���α������׽ǽ�II", "�����а���II", "���α�����׽���I", "�������а���II", "���м���II", "�����ͺ��̽�", "������Ʈ����",
			"�����α׷���", "���������������α׷���", "��ǻ�ͱ���������", "������ȣ�ǹ�", "�����н��װ���׷���", "���÷����̼� ����", "SW���Ȱ���", "�������α׷���", "�Ӻ����ý���",
			"��Žý���", "������Ʈ��ũ", "������Žǹ�", "���α������׽ǽ�III", "���α�����׽���II", "�ֽű����б�����̳�", "����������", "ĸ���ϵ�����", "�����ͺ��̽����α׷���",
			"��ǻ�ͱ׷��Ƚ�", "�����Ϸ�", "�ΰ�����", "������������", "�������Ȱ���", "����Ϻ���", "�繰���ͳ� �ǹ�", "�̵���Žý���", "���α�����̳�", "���ڼ��ڰ���", "����ǽ�");
	static List Listsubpro = Arrays.asList("�̰���", "�̰���", "������", "���", "�ҿ쿵", "������", "�̸���", "������", "���籤", "���籤", "������",
			"������", "������", "������", "������", "��õ��", "������", "������", "������", "������", "�̸���", "�̱�", "�̻�", "���籤", "�̸���", "������",
			"������", "������", "������", "������", "�̻�", "�̱�", "���籤", "�ڼ���", "������", "�ڿ���", "������", "����", "������", "������", "�̸���", "�̱�",
			"�̻�", "���籤", "�̸���", "������", "������", "������", "������", "������", "�̻�", "�̱�", "���籤", "�ڼ���", "������", "�ڿ���", "������",
			"����", "������", "���", "�ҿ쿵", "������", "�̸���", "������", "���籤", "���籤", "������", "������", "������", "������", "������", "��õ��",
			"������", "������", "������", "������", "�̸���", "�̱�", "�̻�", "���籤", "�̸���", "������", "������", "������", "������", "������", "�̻�",
			"�̱�", "���籤", "�ڼ���", "������", "�ڿ���", "������", "����", "������", "�̱�", "�̻�", "�̸���");
	static List Listsubroom = Arrays.asList("3-3-0", "3-3-0", "3-2-2", "3-2-2", "3-3-0", "3-2-2", "3-2-2", "3-2-2",
			"3-3-0", "3-2-2", "3-1-4", "3-3-0", "3-3-0", "3-2-2", "3-2-2", "3-1-4", "3-2-2", "3-3-0", "3-3-0", "3-3-0",
			"3-2-2", "3-3-0", "3-2-2", "3-2-2", "3-2-2", "3-2-2", "3-3-0", "3-3-0", "3-2-2", "3-2-2", "3-3-0", "3-3-0",
			"3-2-2", "3-2-2", "3-3-0", "3-2-2", "3-2-2", "3-3-0", "3-3-0", "3-2-2", "3-3-0", "3-2-2", "3-2-2", "3-3-0",
			"3-2-2", "3-3-0", "3-2-2", "3-3-0", "3-3-0", "3-2-2", "3-2-2", "3-3-0", "2-2-0", "3-3-0", "3-3-0", "3-2-2",
			"3-2-2", "3-2-2", "3-2-2", "3-3-0", "3-2-2", "3-2-2", "3-2-2", "3-3-0", "3-2-2", "3-3-0", "3-3-0", "3-3-0",
			"3-3-0", "3-2-2", "3-2-2", "3-3-0", "3-1-4", "3-3-0", "3-2-2", "3-3-0", "3-2-2", "3-2-2", "3-2-2", "3-2-2",
			"3-2-2", "3-2-2", "3-2-2", "3-3-0", "3-3-0", "3-2-2-3", "3-2-2", "3-3-0", "3-3-0", "3-3-0", "3-2-2",
			"3-3-0", "3-2-2", "3-3-0", "3-3-0", "3-3-0", "3-3-0", "3-2-2");

	public static void student_add() { // �л� �߰� �Լ�
		Scanner input = new Scanner(System.in);

		System.out.print("�̸� : ");
		listA.add(input.next());

		System.out.print("�й� : ");// �ߺ� �Ұ�..
		while (true) {
			String s = input.next();
			if (listB.contains(s) == true) {
				System.out.println("�ߺ��� �й��Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			} else {
				listB.add(s);
				break;
			}
		}
		System.out.print("��ȭ��ȣ  : ");
		listC.add(input.next());

		System.out.print("�̸���: ");
		listemail.add(input.next());

		System.out.print("�Ҽ� : ");
		listdepart.add(input.next());

		System.out.print("���б� : ");
		listSc.add(input.next());

	}

	public static int student_del() {// �л� �����Լ�
		Scanner input = new Scanner(System.in);

		System.out.println("������ �й��� ���ÿ�!");
		int po2 = listB.indexOf(input.next());

		if (po2 == -1) {
			System.out.println("���� ��ȣ�Դϴ�. ");
			return -1;
		}
		try {
			System.out.println("�̸�:" + listA.get(po2));
			System.out.println("�й�:" + listB.get(po2));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("���� ��ȣ�Դϴ�.");
			return -1;
		}
		listA.remove(po2);
		listB.remove(po2);
		listC.remove(po2);
		listemail.remove(po2);
		listdepart.remove(po2);
		System.out.println("�����Ǿ����ϴ�.");
		return po2;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listA.addAll(Arrays.asList("������", "�Ѻ���", "������", "�̼���", "�����", "ȫ�浿", "�����", "������", "������", "�̸���", "ȫ�浿", "����",
				"��ö��", "������", "���ּ�", "������", "������", "���ö", "������", "������", "������", "�Ȼ���", "������", "�̰��", "�̰���", "�̱�ȣ", "������",
				"��ä��", "������", "�����", "�ֹ���", "���缺", "������", "������", "������", "������", "�����", "������", "�Ǽ���", "ȫ�赿"));// �̸�
		listB.addAll(Arrays.asList("20140001", "20140002", "20140003", "20140004", "20140005", "20140006", "20140007",
				"20140008", "20140009", "20140010", "20150001", "20150002", "20150003", "20150004", "20150005",
				"20150006", "20150007", "20150008", "20150009", "20150010", "20160001", "20160002", "20160003",
				"20160004", "20160005", "20160006", "20160007", "20160008", "20160009", "20160010", "20170001",
				"20170002", "20170003", "20170004", "20170005", "20170006", "20170007", "20170008", "20170009",
				"20170010"));// �й�
		listC.addAll(Arrays.asList("010-0000-0001", "010-0000-0002", "010-0000-0003", "010-0000-0004", "010-0000-0005",
				"010-0000-0006", "010-0000-0007", "010-0000-0008", "010-0000-0009", "010-0000-0010", "010-0000-0011",
				"010-0000-0012", "010-0000-0013", "010-0000-0014", "010-0000-0015", "010-0000-0016", "010-0000-0017",
				"010-0000-0018", "010-0000-0019", "010-0000-0020", "010-0000-0021", "010-0000-0022", "010-0000-0023",
				"010-0000-0024", "010-0000-0025", "010-0000-0026", "010-0000-0027", "010-0000-0028", "010-0000-0029",
				"010-0000-0030", "010-0000-0031", "010-0000-0032", "010-0000-0033", "010-0000-0034", "010-0000-0035",
				"010-0000-0036", "010-0000-0037", "010-0000-0038", "010-0000-0039", "010-0000-0040"));
		listemail.addAll(Arrays.asList("a@naver.com", "b@naver.com", "c@naver.com", "d@naver.com", "e@naver.com",
				"f@naver.com", "g@naver.com", "h@naver.com", "i@naver.com", "j@naver.com", "k@naver.com", "l@naver.com",
				"m@naver.com", "n@naver.com", "o@naver.com", "p@naver.com", "q@naver.com", "r@naver.com", "s@naver.com",
				"t@naver.com", "u@naver.com", "v@naver.com", "w@naver.com", "x@naver.com", "y@naver.com", "z@naver.com",
				"a1@naver.com", "a2@naver.com", "a3@naver.com", "a4@naver.com", "a5@naver.com", "a6@naver.com",
				"a7@naver.com", "a8@naver.com", "a9@naver.com", "a10@naver.com", "a11@naver.com", "a12@naver.com",
				"a13@naver.com", "a14@naver.com"));
		listdepart.addAll(Arrays.asList("��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�",
				"��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�",
				"��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�",
				"��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�",
				"��ǻ�Ͱ��к�", "��ǻ�Ͱ��к�"));
		listSc.addAll(Arrays.asList("50", "100", "400", "200", "50", "100", "30", "200", "80", "100", "50", "100",
				"400", "200", "50", "100", "30", "200", "80", "100", "50", "100", "400", "200", "50", "100", "30",
				"200", "80", "100", "50", "100", "400", "200", "50", "100", "30", "200", "80", "100"));

		Scanner input = new Scanner(System.in);

		ArrayList<studentm> st = new ArrayList<studentm>();

		studentm stu1 = new studentm();

		// 4�г� �ϵ��ڵ�
		// 0���л�
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 16, 17, 18, 19, 20, 30, 31, 32, 33, 34, 47, 48, 49,
				50, 51, 52));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5));
		stu1.listCscore.addAll(Arrays.asList(67, 68, 69, 70, 71));
		st.add(0, stu1);

		stu1 = new studentm();

		// 1���л�
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 16, 17, 18, 19, 20, 30, 31, 32, 33, 34, 47, 48, 49,
				50, 51, 52));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5));
		stu1.listCscore.addAll(Arrays.asList(67, 68, 69, 70, 71));
		st.add(1, stu1);
		stu1 = new studentm();
		// 2
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 16, 17, 18, 19, 20, 30, 31, 32, 33, 34, 47, 48, 49,
				50, 51, 52));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5));
		stu1.listCscore.addAll(Arrays.asList(67, 68, 69, 70, 71));
		st.add(2, stu1);
		stu1 = new studentm();
		// 3
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 16, 17, 18, 19, 20, 30, 31, 32, 33, 34, 47, 48, 49,
				50, 51, 52));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5));
		stu1.listCscore.addAll(Arrays.asList(67, 68, 69, 70, 71));

		st.add(3, stu1);
		stu1 = new studentm();
		// 4
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 16, 17, 18, 19, 20, 30, 31, 32, 33, 34, 47, 48, 49,
				50, 51, 52));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5));
		stu1.listCscore.addAll(Arrays.asList(67, 68, 69, 70, 71));

		st.add(4, stu1);
		stu1 = new studentm();
		// 5
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 35, 36, 37, 38, 40, 41, 42, 43,
				46, 64, 70, 71, 80, 96, 97));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5, 4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(71, 72, 73, 74, 75, 76, 77));

		st.add(5, stu1);
		stu1 = new studentm();
		// 6
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 35, 36, 37, 38, 40, 41, 42, 43,
				46, 64, 70, 71, 80, 96, 97));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5, 4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(78, 79, 80, 81, 82, 83, 84));

		st.add(6, stu1);
		stu1 = new studentm();
		// 7
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 35, 36, 37, 38, 40, 41, 42, 43,
				46, 64, 70, 71, 80, 96, 97));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5, 4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(85, 86, 87, 88, 89, 90, 91));

		st.add(7, stu1);
		stu1 = new studentm();
		// 8
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 35, 36, 37, 38, 40, 41, 42, 43,
				46, 64, 70, 71, 80, 96, 97));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5, 4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(91, 92, 93, 94, 95, 96, 97));

		st.add(8, stu1);
		stu1 = new studentm();
		// 9
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 35, 36, 37, 38, 40, 41, 42, 43,
				46, 64, 70, 71, 80, 96, 97));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5, 4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(81, 83, 85, 88, 90, 93));

		st.add(9, stu1);
		stu1 = new studentm();
		// 10 3�г�
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(31, 32, 33, 34, 35, 36, 37));
		st.add(10, stu1);
		stu1 = new studentm();
		// 11
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(38, 39, 40, 41, 42, 43, 44));

		st.add(11, stu1);
		stu1 = new studentm();
		// 12
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(45, 46, 47, 48, 49, 50));

		st.add(12, stu1);
		stu1 = new studentm();
		// 13
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(51, 52, 53, 54, 55, 56, 57));

		st.add(13, stu1);
		stu1 = new studentm();
		// 14
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(58, 59, 60, 61, 62, 63));

		st.add(14, stu1);
		stu1 = new studentm();
		// 15
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(30, 32, 36, 64, 65, 66, 67));

		st.add(15, stu1);
		stu1 = new studentm();
		// 16
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(36, 49, 51, 56, 60, 67));

		st.add(16, stu1);
		stu1 = new studentm();
		// 17
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(30, 36, 49, 51, 52, 53));

		st.add(17, stu1);
		stu1 = new studentm();
		// 18
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(32, 45, 46, 48, 53, 60));

		st.add(18, stu1);
		stu1 = new studentm();
		// 19
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(30, 40, 50, 60, 62, 63));

		st.add(19, stu1);
		stu1 = new studentm();
		// 20 2�г�
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(4, 5, 6, 7));

		st.add(20, stu1);
		stu1 = new studentm();
		// 21
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(4, 5, 6, 7));

		st.add(21, stu1);
		stu1 = new studentm();
		// 22
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(4, 5, 6, 7));

		st.add(22, stu1);
		stu1 = new studentm();
		// 23
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(4, 5, 6, 7));
		st.add(23, stu1);
		stu1 = new studentm();

		// 24

		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(4, 5, 6, 7));

		st.add(24, stu1);
		stu1 = new studentm();

		// 25
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(4, 5, 6, 7, 8, 9));

		st.add(25, stu1);
		stu1 = new studentm();

		// 26
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(10, 11, 12, 13, 14));

		st.add(26, stu1);
		stu1 = new studentm();

		// 27
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(15, 16, 17, 18, 19, 20));

		st.add(27, stu1);
		stu1 = new studentm();

		// 28
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(21, 22, 23, 24, 25, 26));

		st.add(28, stu1);
		stu1 = new studentm();

		// 29
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(21, 22, 27, 28, 29));

		st.add(29, stu1);
		stu1 = new studentm();

		// 30 1�г�
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(30, stu1);
		stu1 = new studentm();

		// 31
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));
		st.add(31, stu1);
		stu1 = new studentm();

		// 32
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));
		st.add(32, stu1);
		stu1 = new studentm();

		// 33
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(33, stu1);
		stu1 = new studentm();

		// 34
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(34, stu1);
		stu1 = new studentm();

		// 35

		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(35, stu1);
		stu1 = new studentm();

		// 36
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(36, stu1);
		stu1 = new studentm();

		// 37
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(37, stu1);
		stu1 = new studentm();

		// 38
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(38, stu1);
		stu1 = new studentm();

		// 39
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(39, stu1);
		stu1 = new studentm();

		// 40
		boolean exit=false;
		
		while (!exit) {
			System.out.println("********************************************");
			System.out.println("1.�л� �߰�");
			System.out.println("2.�л� ����");
			System.out.println("3.�л� �˻�");
			System.out.println("4.���� �˻�");
			System.out.println("5.��Ȳ ���");
			System.out.println("6.���α׷� �����ϱ�");
			System.out.println("********************************************");

			int a = input.nextInt();

			switch (a) {
			case 1:

				while (true) {
					student_add();

					stu1.listsub.addAll(Arrays.asList());
					stu1.listscore.addAll(Arrays.asList());
					stu1.listCscore.addAll(Arrays.asList());
					st.add(stu1);

					stu1 = new studentm();
					System.out.println("�޴��� ���ư��� 1��  ��� �߰��ҷ��� �ƹ����ڳ� �Է� ");

					if (input.nextInt() == 1)
						break;
				}
				break;

			case 2:

				while (true) {
					int a1 = student_del();
					if (a1 == -1)
						break;
					st.remove(a1);

					System.out.println("�޴��� ���ư��� 1��  ��� �߰��ҷ��� �ƹ����ڳ� �Է� ");
					if (input.nextInt() == 1)
						break;
				}
				break;

			case 3:

				System.out.println("�л� ��ȣ�� �Է��Ͻÿ�.");
				int po5 = listB.indexOf(input.next());
				while (true) {
					if (po5 == -1) {
						System.out.println("����1 ��ȣ�Դϴ�.");
						break;
					}
					try {
						System.out.println("�̸��� : " + listA.get(po5) + " �й�  : " + listB.get(po5) + " ��ȭ��ȣ:"
								+ listC.get(po5) + " �̸���: " + listemail.get(po5) + " �Ҽ�(�к�)" + listdepart.get(po5)
								+ " ���б� :" + listSc.get(po5));
					} catch (IndexOutOfBoundsException e) {
						System.out.println("����2 ��ȣ�Դϴ�.");
						break;
					}

					System.out.println("*************************************");
					System.out.println("�л��˻�  \n1.���� ����\n2.��������\n3.��������\n4.�޴��� ���ư���");
					int s = input.nextInt();
					if (s == 1) {

						System.out.println("1.�̸� ���� 2.�й� ���� 3.��ȭ��ȣ  4.�̸���  5.�Ҽ�(�к�) 6.���б�  7.�ڷΰ���");

						int b = input.nextInt();
						switch (b) {
						case 1:
							System.out.println("������ �̸��� �Է��Ͻÿ�.");
							listA.set(po5, input.next());
							System.out.println("����Ϸ�!");
							break;
						case 2:
							System.out.println("������ �й��� �Է��Ͻÿ�");
							listB.set(po5, input.next());
							System.out.println("����Ϸ�!");
							break;
						case 3:
							System.out.println("������ ��ȭ��ȣ �Է��Ͻÿ�");
							listC.set(po5, input.next());
							System.out.println("����Ϸ�!");
							break;
						case 4:
							System.out.println("������ �̸��� �Է��Ͻÿ�");
							listemail.set(po5, input.next());
							System.out.println("����Ϸ�!");
							break;
						case 5:
							System.out.println("������ �Ҽ� �Է��Ͻÿ�");
							listdepart.set(po5, input.next());
							System.out.println("����Ϸ�!");
							break;
						case 6:
							System.out.println("������ ���б� �ݾ��� �Է��Ͻÿ�");
							listSc.set(po5, input.next());
							System.out.println("����Ϸ�!");
							break;
						default:
							break;
						}

						continue;

					} else if (s == 2) {
						System.out.println("��������");
						while (true) {
							System.out.println("1.��ü ���� ���\n2.��������\n3.�����Է�\n4.�ڷΰ���");
							int d = input.nextInt();
							int[] a1 = new int[40];

							if (d == 1) {

								for (int i = 0; i < st.get(po5).listsub.size(); i++) {// ���Ŀ�

									a1[i] = (int) st.get(po5).listsub.get(i);

									System.out.println(
											" ���� " + listsubname.get(a1[i]) + " ����: " + st.get(po5).listscore.get(i));
								}

							} else if (d == 2) {
								for (int i = 0; i < st.get(po5).listsub.size(); i++) {

									a1[i] = (int) st.get(po5).listsub.get(i);

									System.out.println(i + " :" + " ���� " + listsubname.get(a1[i]));
								}
								try {// ���������ȣ ����ó��
									System.out.println("������ ���� ��ȣ�� �Է��Ͻÿ�..");
									int n = input.nextInt();
									System.out.println(" ���� :" + listsubname.get((int) st.get(po5).listsub.get(n)) + " ����: "
											+ st.get(po5).listscore.get(n) + "\n������ ������ �Է��Ͻÿ�");
									st.get(po5).listscore.set(n, input.nextDouble());
								} catch (IndexOutOfBoundsException E) {
									System.out.println("�߸��Է��ϼ˽��ϴ�.");
									continue;
								}

							}

							else if (d == 3) {
								
								for (int i = 0; i < listsubname.size(); i++) {
									System.out.print(i + ".����� :  " + listsubname.get(i) + "\t\t");
									if (i % 5 == 0)
										System.out.println();

								}
								System.out.println("������ �߰��� �����ȣ�� �Է��Ͻÿ�");
								int a5=input.nextInt();
								if(st.get(po5).listsub.contains(a5)){
									System.out.println("�̹� �߰��Ǿ� �ִ� �����Դϴ�.");
									break;
									
								}
								st.get(po5).listsub.add(a5);
								System.out.println("���� �Է��Ͻÿ�.");
								st.get(po5).listscore.add(input.nextDouble());
								
							}
							else if(d==4){
								break;// 2�� �޴� ����
							}
						}
						continue;// �ڷ� ���Ʊ��

					} else if (s == 3) {

						System.out.println("��������");
						while (true) {
							System.out.println("1.��ü ���� ��Ȳ\n2.���� ��û\n3.���� ����\n4.�ڷ� ���ư���");
							int d = input.nextInt();
							if (d == 1) {
								int b21[] = new int[20];
								for (int i = 0; i < st.get(po5).listCscore.size(); i++) {// ���Ŀ�

									b21[i] = (int) st.get(po5).listCscore.get(i);

									System.out.println(i + " : " + listsubname.get(b21[i]));
								}

							}

							else if (d == 2) {
								System.out.println("������û");

								for (int i = 0; i < listsubname.size(); i++) {
									System.out.print(i + ".����� :  " + listsubname.get(i) + "\t\t");
									if (i % 5 == 0)
										System.out.println();

								}
								System.out.println("\n ��û�� ���� ��ȣ�� �Է��Ͻÿ�.");
								int n3 = input.nextInt();
								if (st.get(po5).listCscore.contains(n3) == true) {
									System.out.println("�̹� ��û�� �����Դϴ�.");
								} else {
									st.get(po5).listCscore.add(n3);
								}
							}

							else if (d == 3) {

								int b3[] = new int[20];// b3�� ���� ����� ����

								for (int i = 0; i < st.get(po5).listCscore.size(); i++) {// ���Ŀ�

									b3[i] = (int) st.get(po5).listCscore.get(i);
									System.out.println(i + ". " + "����" + listsubname.get(b3[i]));

								}
								System.out.println("���� ������ ��ȣ�� �Է��Ͻÿ�");

								st.get(po5).listCscore.remove(input.nextInt());

							} else if (d == 4) {
								break;
							}

						}
					} else if (s == 4) {
						break;
					}

					continue;//�ڷ� ���ư���

				}
				break;

			case 4:

				System.out.println("������ �Է��Ͻÿ�");
				String s = input.next();
				if (listsubname.contains(s) == false) {
					System.out.println("���� ����� �Դϴ�. �ٽ� �Է��ϼ��ּ���.");
					break;
				}
				int a1 = listsubname.indexOf(s);// a1������ ���� �ڸ�.
				System.out.println("�����: " + listsubname.get(a1) + " ��� ���� :" + Listsubpro.get(a1) + " �а���: "
						+ Listsubroom.get(a1));
				while (true) {

					System.out.println("1.��������\n2.������ Ȯ��\n3.������ �߰�\n4.������ ����\n5.�޴��� ���ư���");
					int g = input.nextInt();

					if (g == 1) {

						System.out.println("1.�����  2.��� ����  3.�а��� 4.�ڷΰ���");
						int n2 = input.nextInt();

						switch (n2) {
						case 1:
							System.out.println("1.����� :");
							listsubname.set(a1, input.next());
							System.out.println("����Ǿ����ϴ�.");
							break;
						case 2:
							System.out.println("2.��� ����:");
							Listsubpro.set(a1, input.next());

							break;
						case 3:
							System.out.println("3.�а���");
							Listsubroom.set(a1, input.next());
							break;

						default:
							break;
						}

					}

					else if (g == 2) {
						System.out.println("������ Ȯ��");

						for (int i = 0; i < listA.size(); i++) {
							if (st.get(i).listCscore.contains(a1) == true) {
								System.out.println("�̸��� : " + listA.get(i) + " �й�  : " + listB.get(i) + " ��ȭ��ȣ:"
										+ listC.get(i) + " �̸���: " + listemail.get(i) + " �Ҽ�(�к�)" + listdepart.get(i));

							}

						}

					} else if (g == 3) {

						System.out.println("������ �߰�");
						System.out.println("�й��� �Է��Ͻÿ�!");

						int b4 = listB.indexOf(input.next());
						try {
							if (st.get(b4).listCscore.contains(a1)) {
								System.out.println("�̹� �߰��Ǿ� �ִ� �л��Դϴ�.");
							}
						} catch (IndexOutOfBoundsException e) {
							System.out.println("���� ���� �ʴ� �й��Դϴ�.");
							continue;
						}
						st.get(b4).listCscore.add(a1);

					} else if (g == 4) {
						System.out.println("������ ����");
						System.out.println("�й��� �Է��Ͻÿ�!");

						int b4 = listB.indexOf(input.next());

						try {

							int a2 = st.get(b4).listCscore.indexOf(a1);

							st.get(b4).listCscore.remove(a2);
							System.out.println("�����Ǿ����ϴ�.");
						} catch (IndexOutOfBoundsException e) {
							System.out.println("�������� ���� �й��Դϴ�.");
							continue;
						}
					}

					else if (g == 5) {
						break;
					} else {

					}
				}

				break;

			case 5:
				while (true) {
					System.out.println("1.�л� ��Ȳ ���\n2.���� ��Ȳ ���\n3.��ü �л� ���\n4.�޴��� ���ư���");
					int g = input.nextInt();
					double sum = 0;
					int i4 = 0;
					if (g == 1) {
						double[][] b3 = new double[100][40];
						for (int i = 0; i < listA.size(); i++) {// ���Ŀ�
							for (int j = 0; j < st.get(i).listscore.size(); j++) {
								b3[i][j] = (double) st.get(i).listscore.get(j);

								sum += b3[i][j];
								i4++;

							}
						}
						int sum1 = 0;
						for (int i = 0; i < listA.size(); i++) {// ���Ŀ�

							sum1 += st.get(i).listCscore.size();

						}

						double ave = sum / i4;
						double ave1 = sum1 / (double) listA.size();

						System.out.println("��ü �л� ����: " + listA.size() + "\n��ü�������: " + String.format("%.3f", ave)
								+ " ��ü ���� ���� ��� ���� : " + ave1);

					} else if (g == 2) {
						int sum3[] = new int[100];
						System.out.println("���� ��Ȳ ���");
						System.out.println(listA.size());
						// ����X�л�X������ ��������... ���� ������ ���� ã��.
						for (int k = 0; k < listsubname.size(); k++) {
							for (int i1 = 0; i1 < listA.size(); i1++) {// ���Ŀ�
								for (int j = 0; j < st.get(i1).listCscore.size(); j++) {
									if (st.get(i1).listCscore.contains(k) == true) {
	
										sum3[k]++;
										break;
									}

								}
							}
						}
						for (int i = 0; i < listsubname.size(); i++)
							System.out.println("����� : " + listsubname.get(i) + " ��米�� : " + Listsubpro.get(i)
									+ " �а��� : " + Listsubroom.get(i) + " ������ ����:" + sum3[i]);
					} else if (g == 3) {
						System.out.println("��ü �л� ���");

						for (int i = 0; i < listA.size(); i++)
							System.out.println("�̸�: " + listA.get(i) + "" + " �й�: " + listB.get(i) + " ��ȭ��ȣ:"
									+ listC.get(i) + " �̸���: " + listemail.get(i) + " �Ҽ�(�к�)" + listdepart.get(i));
					}

					else if (g == 4) {
						break;
					}
				}
				break;
			case 6: exit=true;
			System.out.println("���α׷� ����");
			break;
			default:
				System.out.println("���ڸ� �ٽ� �Է��Ͻÿ�!");
			}

		}

	}

}
