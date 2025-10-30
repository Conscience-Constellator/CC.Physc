package CC.Encycloped.Abs.Scal.Physc;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap.*;

import CC.Encycloped.Abs.Scal.Gom.Vectr_Typ_Havr;
import CC.Util.By.Get_Q_By_Q;

public interface Get_Phys_Comp<Vectr_Typ extends Get_Q_By_Q> extends Vectr_Typ_Havr<Vectr_Typ>
{
//	Clas_Rap Class=Ad_Reg_Task(Get_Phys_Comp.class);

	Phys_Com Phys_Comp(Clas_Rap var1);
}