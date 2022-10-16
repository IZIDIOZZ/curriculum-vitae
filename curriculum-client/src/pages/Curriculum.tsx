
import { useState, useEffect } from 'react'
import { getUser } from '../services/userService'
import { AxiosResponse } from 'axios'
import { User } from '../models/User'
import DocInformation from '../components/DocInformation'
import ProfessionalExperienceView from '../components/ProfessionalExperienceView'
import AcademicEducationView from '../components/AcademicEducationView'
import KnowledgesView from '../components/KnowledgesView'
import LanguageProficiencyView from '../components/LanguageProficiencyView'

const Curriculum = () => {
    const [user, setUser] = useState<User>()

    useEffect(() => {
        getUser(1).then(
            ({ data }: AxiosResponse<User>) => {
                setUser(data);
            }
        )
    }, [])

    return (
        <>
            {
                user &&
                <article>
                    <h1>{user?.name}</h1>
                    <hr />
                    <DocInformation userInformation={user} />
                    <div id="secao-dados">
                        <ProfessionalExperienceView professionalExperiences={user?.professionalExperiences} />
                        <AcademicEducationView academicEducations={user?.academicEducations} />
                    </div>
                    <KnowledgesView knowledges={user?.knowledges} />
                    <LanguageProficiencyView languageProficiencies={user?.languageProficiencies} />
                </article>
                ||
                <div className='erro'>
                    User Not Found
                </div>
            }
        </>
    )
}
export default Curriculum
