create or replace procedure info_empinfo
(v_empno IN emp02.empno%type,
v_ename OUT emp02.ename%type,
v_hiredate OUT emp02.hiredate%type  
)
is
begin
       select ename, hiredate
	  into v_ename, v_hiredate
	  from emp02
	  where empno=v_empno;

end;
/
-- ���ν��� ���� ������� ���Թ��� ���� ����
variable vename varchar2(20);
variable vhiredate varchar2(50);

--���ν��� ȣ��(���� ���Թ��� out mode�� ����� ���� ����)
execute info_empinfo(7369, :vename, :vhiredate)

--�������� ��� 
print vename;
print vhiredate;
