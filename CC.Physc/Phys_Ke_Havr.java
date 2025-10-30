package CC.Encycloped.Abs.Scal.Physc;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;

public interface Phys_Ke_Havr<Phys_Typ>
{
	Clas_Rap _Clas_Rap=Clas_Rap.Ad_Reg_Task(Phys_Ke_Havr.class);

	Phys_Typ Get_Phys(String Nam);
}