import { AcademicEducation } from '../models/AcademicEducation'

type AcademicEducationViewProps = {
    academicEducations?: Array<AcademicEducation>
}

const AcademicEducationView = ({ academicEducations }: AcademicEducationViewProps) => {
    return (
        <section id="form-acad" className="secao-doc">
            <h2>Formação acadêmica</h2>
            <ul>
                {academicEducations?.map((academicEducation, index) => (
                    <li key={index}>
                        <h3>{academicEducation.title}</h3>
                        <p><strong>{academicEducation.educationInstitution}</strong></p>
                    </li>
                ))}
            </ul>
        </section>
    )
}

export default AcademicEducationView