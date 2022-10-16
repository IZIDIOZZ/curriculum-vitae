import { ProfessionalExperience } from '../models/ProfessionalExperience'

type ProfessionalExperienceProps = {
    professionalExperiences: Array<ProfessionalExperience> | undefined
}

const ProfessionalExperienceView = ({ professionalExperiences }: ProfessionalExperienceProps) => {
    return (
        <section id="exp-prof" className="secao-doc">
            <h2>Experiências profissionais</h2>
            <ul>
                {professionalExperiences?.map((professionaExperience, index) => (
                    <li key={index}>
                        <h3>{professionaExperience.company}</h3>
                        <p><strong>{professionaExperience.role}</strong></p>
                        <p>Período: <strong>{professionaExperience.workingTime}</strong></p>
                    </li>
                ))}
            </ul>
        </section>
    )
}

export default ProfessionalExperienceView