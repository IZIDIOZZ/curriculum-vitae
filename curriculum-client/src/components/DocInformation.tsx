import { User } from '../models/User'

type DocInformationProps = {
    userInformation: User | undefined
}

const DocInformation = ({ userInformation }: DocInformationProps) => {
    return (
        <section id="dados-contato">
            <div>
                <img src={userInformation?.imageProfileUrl} />
            </div>
            <div className="secao-doc">
                <p>E-mail: <span>{userInformation?.email}</span></p>
                <p>Telefone: <span>{userInformation?.phone}</span></p>
                <p>Data de nascimento: <span>{userInformation?.birthDate}</span></p>
                <p>LinkedIn:
                    <span>
                        <a href={userInformation?.linkedin}>
                            {userInformation?.linkedin}
                        </a>
                    </span>
                </p>
                <p>Github:
                    <span>
                        <a href={userInformation?.github}>
                            {userInformation?.github}
                        </a>
                    </span>
                </p>
            </div>
        </section>
    )
}

export default DocInformation