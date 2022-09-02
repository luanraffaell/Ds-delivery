import './styles.css';
import {ReactComponent as YoutubeIcon} from './youtube.svg'
import {ReactComponent as LinkedinIcon} from './linkedin.svg'
import {ReactComponent as InstagramIcon} from './Instagram.svg'
function Footer(){
    return(
       <footer className='main-footer'>
        Me siga em minhas <strong>redes</strong>
        <div className='footer-icons'>
            <a href="https://youtube.com" target="_new">
                <YoutubeIcon />
            </a>
            <a href="https://linkedin.com" target="_new">
                <LinkedinIcon />
            </a>
            <a href="https://instagram.com" target="_new">
                <InstagramIcon />
            </a>
        </div>
       </footer>
    )
}
export default Footer