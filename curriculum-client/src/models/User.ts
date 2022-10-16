import { AcademicEducation } from "./AcademicEducation";
import { Knowledge } from "./Knowledge";
import { LanguageProficiency } from "./LanguageProficiency";
import { ProfessionalExperience } from "./ProfessionalExperience";

export interface User {
    id: number;
    email: string;
    name: string;
    phone: string;
    linkedin: string;
    github: string;
    birthDate: string;
    imageProfileUrl: string;
    professionalExperiences: Array<ProfessionalExperience>;
    academicEducations: Array<AcademicEducation>;
    knowledges: Array<Knowledge>;
    languageProficiencies: Array<LanguageProficiency>;
}
