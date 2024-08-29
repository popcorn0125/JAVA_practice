package org.comstudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

interface Command {
    void procerss();
}

class Menu implements Command {
    @Override
    public void procerss() {
        PhoneBookApp.printTitle("MENU");
        System.out.println("1.input 2.output 3.search 4.modify 5.delete 6.finish");
        System.out.print("Choice: ");
        PhoneBookApp.no = PhoneBookApp.scan.nextInt();
    }
}

class Input implements Command {
    @Override
    public void procerss() {
        PhoneBookApp.printTitle("INPUT");
        System.out.print("성명 입력: ");
        String newName = PhoneBookApp.scan.next();
        System.out.print("전화번호 입력: ");
        String newPhone = PhoneBookApp.scan.next();

        PhoneBookApp.phoneList.add(new Phone(PhoneBookApp.noSequence++, newName, newPhone));
        System.out.println("새 전화번호 입력 완료!");
        PhoneBookApp.no = 0;
    }
}

class Output implements Command {
    @Override
    public void procerss() {
        PhoneBookApp.printTitle("OUTPUT");
        // ArrayList<Phone> list = PhoneBookApp.phoneList;
        for (Phone phone : PhoneBookApp.phoneList) {
            System.out.println(phone);
        }
        PhoneBookApp.no = 0;
    }
}

class Modify implements Command {
    @Override
    public void procerss() {
        PhoneBookApp.printTitle("MODIFY");
        System.out.print("수정 할 이름 입력: ");
        String modifyName = PhoneBookApp.scan.next();
        // Phone 객체에 equals()와 hashcode()를 Override해야 한다.
        int findIdx = PhoneBookApp.phoneList.indexOf(new Phone(modifyName));
        if (findIdx != -1) {
            System.out.print("새 전화번호 입력: ");
            String newPhone = PhoneBookApp.scan.next();
            PhoneBookApp.phoneList.get(findIdx).setPhone(newPhone);
        }
        if (findIdx == -1) {
            System.out.println("검색 한 이름이 없습니다!");
        }

        PhoneBookApp.no = 0;
    }
}

class Search implements Command {
    @Override
    public void procerss() {
        PhoneBookApp.printTitle("SEARCH");
        System.out.print("검색 할 이름 입력: ");
        String modifyName = PhoneBookApp.scan.next();
        // Phone 객체에 equals()와 hashcode()를 Override해야 한다.
        int findIdx = PhoneBookApp.phoneList.indexOf(new Phone(modifyName));
        if (findIdx != -1) {
            System.out.println("검색 결과: ");
            System.out.println(PhoneBookApp.phoneList.get(findIdx));
        }
        if (findIdx == -1) {
            System.out.println("검색 한 이름이 없습니다!");
        }

        PhoneBookApp.no = 0;
    }
}

class Delete implements Command {
    @Override
    public void procerss() {
        PhoneBookApp.printTitle("DELETE");
        System.out.print("삭제 할 이름 입력: ");
        String modifyName = PhoneBookApp.scan.next();
        // Phone 객체에 equals()와 hashcode()를 Override해야 한다.
        int findIdx = PhoneBookApp.phoneList.indexOf(new Phone(modifyName));
        if (findIdx != -1) {
            System.out.println(PhoneBookApp.phoneList.remove(findIdx));
            System.out.println("삭제 완료");
        }
        if (findIdx == -1) {
            System.out.println("검색 한 이름이 없습니다!");
        }

        PhoneBookApp.no = 0;
    }
}

class Finish implements Command {
    @Override
    public void procerss() {
        PhoneBookApp.printTitle("FINISH");
        System.out.println("프로세스 종료! 수고하셨습니다. ");

        // 프로세스 강제 종료
        System.exit(0);
    }
}

public class PhoneBookApp {
    public static Scanner scan = new Scanner(System.in);
    public static final ArrayList<Phone> phoneList = new ArrayList<Phone>();
    public static int noSequence = 1;
    static {
        phoneList.add(new Phone(noSequence++, "홍길동", "010-1111-1111"));
        phoneList.add(new Phone(noSequence++, "김길동", "010-2222-2222"));
        phoneList.add(new Phone(noSequence++, "박길동", "010-3333-3333"));
    }
    public static final HashMap<Integer, Command> commandMap = new HashMap<Integer, Command>();
    static {
        // static 초기화 블럭 - static 멤버를 초기화 한다.
        commandMap.put(0, new Menu());
        commandMap.put(1, new Input());
        commandMap.put(2, new Output());
        commandMap.put(3, new Search());
        commandMap.put(4, new Modify());
        commandMap.put(5, new Delete());
        commandMap.put(6, new Finish());
    }
    public static int no = 0;
    public static Command command = null;

    public static void printTitle(String title) {
        System.out.println("::::::::::::::::::::: " + title + " :::::::::::::::::::::");
    }

    public static void main(String[] args) {
        command = commandMap.get(no);
        command.procerss();
        System.out.println("---------------------------------------------------");
        // 재귀호출
        main(null);
    }
}
