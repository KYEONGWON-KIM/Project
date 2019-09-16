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
-- 프로시저 실행 결과값을 대입받을 변수 선언
variable vename varchar2(20);
variable vhiredate varchar2(50);

--프로시저 호출(값을 대입받을 out mode에 선언된 변수 적용)
execute info_empinfo(7369, :vename, :vhiredate)

--변수값을 출력 
print vename;
print vhiredate;
